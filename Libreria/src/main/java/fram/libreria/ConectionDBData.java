/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Archivo de configuracion de conexión a la base de datos principal 
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "dataEntityManagerFactory", 
        transactionManagerRef = "dataTransactionManager", 
        basePackages = {"fram.libreria.model.acces.data"}
) 
public class ConectionDBData {
    @Autowired
    private Environment env;  
    
    /**
     * Genera una configuración de conexión a una base de datos 
     * @return Datasource
     */
    @Bean(name = "dataDataSource")
    public DataSource userDataSource(){
       DriverManagerDataSource datasource = new DriverManagerDataSource();  
       datasource.setUrl(env.getProperty("dataModel.datasource.url"));
       datasource.setUsername(env.getProperty("dataModel.datasource.username"));
       datasource.setPassword(env.getProperty("dataModel.datasource.password")); 
       datasource.setDriverClassName(env.getProperty("dataModel.datasource.driver-class-name"));
       return datasource;  
    }
    
    /**
     * Contenedor de tipo Bean, que mapea la base de datos 
     * @return LocalContainerEntityManagerFactoryBean
     */
    @Bean(name = "dataEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean em  = new LocalContainerEntityManagerFactoryBean();  
        em.setDataSource(userDataSource());
        em.setPackagesToScan("fram.libreria.model.domain.data");
        
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();  
        em.setJpaVendorAdapter(vendorAdapter);
        
        Map<String, Object> properties =  new HashMap<>();  
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("dataModel.jpa.hibernate.ddl-auto"));
        properties.put("hibernate.show-sql", env.getProperty("dataModel.jpa.show-sql"));
    	properties.put("hibernate.dialect", env.getProperty("dataModel.jpa.database-plattform"));
        return em; 
    }
    
    /**
     * Lanza los servicios generados por LocalContainerEntityManagerFactoryBean
     * @return PlatformTransactionManager
     */
    @Bean(name = "dataTransactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());	
        return transactionManager;
    }
    
}
