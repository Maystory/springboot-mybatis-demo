package com.mf.mybatisdemo.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author apple
 */
@Configuration
public class MybatisPlusConfig {
	/***
	 * plus 的性能优化
	 * @return
     */
	// @Bean
	// public PerformanceInterceptor performanceInterceptor() {
	// 	PerformanceInterceptor performanceInterceptor=new PerformanceInterceptor();
	// 	/*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
	// 	performanceInterceptor.setMaxTime(1000);
	// 	/*<!--SQL是否格式化 默认false-->*/
	// 	performanceInterceptor.setFormat(true);
	// 	return performanceInterceptor;
	// }

	/**
	 *	 mybatis-plus分页插件
	 */
	// @Bean
	// public PaginationInterceptor paginationInterceptor() {
	// 	PaginationInterceptor page = new PaginationInterceptor();
	// 	page.setDialectType("mysql");
	// 	return page;
	// }

	/**
	 *
	 * @return
	 */
	// @Bean
	// public MapperScannerConfigurer mapperScannerConfigurer(){
	// 	MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
	// 	//可以通过环境变量获取你的mapper路径,这样mapper扫描可以通过配置文件配置了
	// 	scannerConfigurer.setBasePackage("com.mf.mybatisdemo.*.mapper");
	// 	return scannerConfigurer;
	// }
}