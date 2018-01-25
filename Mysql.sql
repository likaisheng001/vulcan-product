  `province_name` varchar(255) DEFAULT '' COMMENT '一级地址名称',
  `city_id` varchar(255) DEFAULT '' COMMENT '二级地址id',
  `city_name` varchar(255) DEFAULT '' COMMENT '二级地址名称',

#被修改后的查询所有银行信息 - listAllBank
select 
	bank_code_id id,
	bank_code code,
	bank_name name,
	bank_country_code_id bankCountryCodeId,
	bank_of_class bankOfClass,
	province_id provinceId,
	province_name provinceName,
	city_id cityId,
	city_name cityName,
	is_valid isValid
from bank_code 
left join 
where is_valid=1

CREATE ALGORITHM=UNDEFINED DEFINER=`stock`@`localhost` SQL SECURITY DEFINER VIEW `view_region` AS select `county`.`region_id` AS `county_region_id`,`county`.`parent_region_id` AS `county_parent_region_id`,`county`.`region_name` AS `county_region_name`,`county`.`region_level_id` AS `county_region_level_id`,`county`.`region_code` AS `county_region_code`,`county`.`is_valid` AS `county_is_valid`,`county`.`invalid_begin_date` AS `county_invalid_begin_date`,`city`.`region_id` AS `city_region_id`,`city`.`parent_region_id` AS `city_parent_region_id`,`city`.`region_name` AS `city_region_name`,`city`.`region_level_id` AS `city_region_level_id`,`city`.`region_code` AS `city_region_code`,`city`.`is_valid` AS `city_is_valid`,`city`.`invalid_begin_date` AS `city_invalid_begin_date`,`province`.`region_id` AS `province_region_id`,`province`.`parent_region_id` AS `province_parent_region_id`,`province`.`region_name` AS `province_region_name`,`province`.`region_level_id` AS `province_region_level_id`,`province`.`region_code` AS `province_region_code`,`province`.`is_valid` AS `province_is_valid`,`province`.`invalid_begin_date` AS `province_invalid_begin_date` from ((`region` `county` left join `region` `city` on((`county`.`parent_region_id` = `city`.`region_id`))) left join `region` `province` on((`city`.`parent_region_id` = `province`.`region_id`))) where ((`city`.`region_level_id` = 2) and (`province`.`region_level_id` = 1) and (`county`.`region_level_id` = 3))