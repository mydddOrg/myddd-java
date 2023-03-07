package org.myddd.persistence.jpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.myddd.persistence.AbstractTest;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
class NamedQueryParserTest extends AbstractTest {

    @Inject
    private NamedQueryParser namedQueryParser;

    @Test
    void testNamedQueryParseNotNull(){
        Assertions.assertNotNull(namedQueryParser);
        Assertions.assertNotNull(namedQueryParser.getEntityManager());
    }

    @Test
    void testGetQueryStringOfNamedQuery(){
        String namedQuerySQL = namedQueryParser.getQueryStringOfNamedQuery("User.queryByUserId");
        Assertions.assertNotNull(namedQuerySQL);

        Assertions.assertThrows(IllegalArgumentException.class,()->{
            namedQueryParser.getQueryStringOfNamedQuery("User.notExists");
        });
    }

}
