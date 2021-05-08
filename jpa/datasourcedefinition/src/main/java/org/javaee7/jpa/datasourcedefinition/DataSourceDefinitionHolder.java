package org.javaee7.jpa.datasourcedefinition;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;

/**
 * @author Alexis Hassler
 */
@DataSourceDefinition(name = "java:global/MyApp/MyDataSource",
    className = "org.h2.jdbcx.JdbcDataSource",
    url = "jdbc:h2:mem:test")
@Stateless
public class DataSourceDefinitionHolder {
}
