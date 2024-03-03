package com.woongs.springjpa.confiugration;

import com.woongs.springjpa.domain.Domains;
import com.woongs.springjpa.domain.entity.Entities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackageClasses = Domains.class,
        transactionManagerRef = "transactionManager",
        entityManagerFactoryRef = "entityManagerFactory")
@EnableTransactionManagement
public class JpaConfiguration {

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
