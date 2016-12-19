package com.startup.saas.config;

import java.util.Properties;

import javax.sql.DataSource;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//@Configuration
//@MapperScan("com.startup.saas.storage.mapper")
public class MybatisConfig {


    private Logger logger = LoggerFactory.getLogger(MybatisConfig.class);

	@Autowired
	private Environment env;
	
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:META-INF/mybatis/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * 创建数据源
     * @param
     * @return 
     */
    @Bean
	public DataSource dataSource(){
		Properties properties = new Properties();
		properties.setProperty("driverClassName", env.getProperty("spring.datasource.driver-class-name"));
		properties.setProperty("url", env.getProperty("spring.datasource.url"));
		properties.setProperty("username", env.getProperty("spring.datasource.username"));
		properties.setProperty("password", env.getProperty("spring.datasource.password"));
        try {
			return DruidDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			return null;
		}
	}


    /**
     * mybatis 分页插件
     * @param dataSource
     * @return
     */
    @Bean
    public PageHelper pageHelper(DataSource dataSource) {
        logger.info("register mybatis pageHelper ..");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
    

//    public DataSource dataSource() {
//    	//创建分库
//        DataSourceRule dataSourceRule = new DataSourceRule(createDataSourceMap());
//        //创建分表
//        TableRule orderTableRule = TableRule.builder("t_order").actualTables(Arrays.asList("t_order_0", "t_order_1")).dataSourceRule(dataSourceRule).build();
//        TableRule orderItemTableRule = TableRule.builder("t_order_item").actualTables(Arrays.asList("t_order_item_0", "t_order_item_1")).dataSourceRule(dataSourceRule).build();
//        
//        ShardingRule shardingRule = ShardingRule.builder()
//        		.dataSourceRule(dataSourceRule)
//        		.tableRules(Arrays.asList(orderTableRule, orderItemTableRule))
//                .bindingTableRules(Collections.singletonList(new BindingTableRule(Arrays.asList(orderTableRule, orderItemTableRule))))
//                .databaseShardingStrategy(new DatabaseShardingStrategy("user_id", new ModuloDatabaseShardingAlgorithm()))
//                .tableShardingStrategy(new TableShardingStrategy("order_id", new ModuloTableShardingAlgorithm())).build();
//        
//        return new ShardingDataSource(shardingRule);
//    }
//    
//    public Map<String, DataSource> createDataSourceMap() {
//        Map<String, DataSource> result = new HashMap<String, DataSource>(2);
//        result.put("ds_0", createDataSource("ds_0"));
//        result.put("ds_1", createDataSource("ds_1"));
//        return result;
//    }
    
}
