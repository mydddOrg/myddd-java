package org.myddd.persistence.jpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.myddd.domain.AbstractRepository;
import org.myddd.persistence.AbstractTest;
import org.myddd.persistence.mock.User;

import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import jakarta.transaction.Transactional;
import java.util.List;

@Transactional
class AbstractRepositoryTest extends AbstractTest {

    @Inject
    private AbstractRepository repository;

    @Test
    void testRepositoryNotNull(){
        Assertions.assertNotNull(repository);
    }

    @Test
    void testSaveEntity(){
        User user = randomUser();
        User created = repository.save(user);
        Assertions.assertNotNull(created);
    }

    @Test
    void testUniqueSaveEntity(){
        var created = randomUser().createLocalUser();

        User notUniqueUser = randomUser();
        notUniqueUser.setUserId(created.getUserId());
        notUniqueUser.createLocalUser();
        Assertions.assertThrows(PersistenceException.class,()->repository.flush());
    }

    @Test
    void testGetEntity(){
        User notExistsUser = repository.get(User.class,1L);
        Assertions.assertNull(notExistsUser);

        User created = repository.save(randomUser());
        User queryUser = repository.get(User.class,created.getId());
        Assertions.assertNotNull(queryUser);
    }

    @Test
    void testRemoveEntity(){
        User created = repository.save(randomUser());
        User queryUser = repository.get(User.class,created.getId());
        Assertions.assertNotNull(queryUser);

        repository.remove(created);
        queryUser = repository.get(User.class,created.getId());
        Assertions.assertNull(queryUser);
    }

    @Test
    void testEntityExists(){
        boolean exists = repository.exists(User.class,-1L);
        Assertions.assertFalse(exists);


        User created = repository.save(randomUser());
        exists = repository.exists(User.class,created.getId());
        Assertions.assertTrue(exists);
    }

    @Test
    void batchSave(){
        var batchUsers = List.of(randomUser(),randomUser());
        Assertions.assertDoesNotThrow(() -> repository.batchSaveEntities(batchUsers));

        var notValidBatchUsers = List.of(randomUser(),new User());
        Assertions.assertThrows(PersistenceException.class,()-> repository.batchSaveEntities(notValidBatchUsers));
    }
}
