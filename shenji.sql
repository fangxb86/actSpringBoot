CREATE TABLE `adt_prj` (
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `adt_prj_nm` varchar(32) DEFAULT NULL,
  `adt_plan_id` bigint(20) unsigned DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `type` tinyint(3) unsigned DEFAULT NULL,
  `bld_mtd` tinyint(3) unsigned DEFAULT NULL,
  `adt_stdt` date DEFAULT NULL,
  `adt_eddt` date DEFAULT NULL,
  `impl_stdt` date DEFAULT NULL,
  `impl_eddt` date DEFAULT NULL,
  `exp_days` smallint(5) unsigned DEFAULT NULL,
  `lead_dept_id` bigint(20) unsigned DEFAULT NULL,
  `mngd_dept_id` bigint(20) unsigned DEFAULT NULL,
  `ases_anul` varchar(8) DEFAULT NULL,
  `prj_ceft` tinyint(3) unsigned DEFAULT NULL,
  `anul_plan_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `adt_plan` (
  `adt_plan_id` bigint(20) unsigned DEFAULT NULL,
  `adt_plan_nm` varchar(32) DEFAULT NULL,
  `adt_tgt` varchar(255) DEFAULT NULL,
  `plan_anul` varchar(8) DEFAULT NULL,
  `plan_dept_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_prj_inst` (
  `lgc_sn` bigint(20) unsigned DEFAULT NULL,
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `by_inst_id` bigint(20) unsigned DEFAULT NULL,
  `exec_inst_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_grp` (
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `atd_grp_nm` varchar(32) DEFAULT NULL,
  `adt_grp_type` tinyint(3) unsigned DEFAULT NULL,
  `adt_prjgrp_id` bigint(20) unsigned DEFAULT NULL,
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `by_inst_id` bigint(20) unsigned DEFAULT NULL,
  `by_inst_nm` varchar(32) DEFAULT NULL,
  `exe_inst_id` bigint(20) unsigned DEFAULT NULL,
  `exe_inst_nm` varchar(32) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_grp_memb` (
  `lgc_sn` bigint(20) unsigned DEFAULT NULL,
  `emp_id` bigint(20) unsigned DEFAULT NULL,
  `emp_nm` varchar(10) DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `role_id` varchar(20) DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `act_stdt` date DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_prj_mnhr` (
  `lgc_sn` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `adt_step` tinyint(3) unsigned DEFAULT NULL,
  `est_emp_num` tinyint(3) unsigned DEFAULT NULL,
  `est_day_num` smallint(5) unsigned DEFAULT NULL,
  `est_hr_num` smallint(5) unsigned DEFAULT NULL,
  `act_emp_num` tinyint(3) unsigned DEFAULT NULL,
  `act_day_num` smallint(5) unsigned DEFAULT NULL,
  `act_hr_num` smallint(5) unsigned DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_prj_eps` (
  `lgc_sn` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `eps_type` tinyint(3) unsigned DEFAULT NULL,
  `est_emp_num` tinyint(3) unsigned DEFAULT NULL,
  `est_day_num` smallint(5) unsigned DEFAULT NULL,
  `est_unit_prc` smallint(5) unsigned DEFAULT NULL,
  `act_emp_num` tinyint(3) unsigned DEFAULT NULL,
  `act_day_num` smallint(5) unsigned DEFAULT NULL,
  `act_unit_prc` smallint(5) unsigned DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_schm` (
  `adt_schm_id` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `adt_tgt` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_item` (
  `adt_item_id` bigint(20) unsigned DEFAULT NULL,
  `adt_item_ttl` varchar(32) DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `prt_node_id` bigint(20) unsigned DEFAULT NULL,
  `adt_item_desc` varchar(255) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_ntf` (
  `adt_ntf_id` bigint(20) unsigned DEFAULT NULL,
  `adt_ntf_ttl` varchar(32) DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `rcv_inst_id` bigint(20) unsigned DEFAULT NULL,
  `rcv_emp_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_doc` (
  `adt_doc_id` bigint(20) unsigned DEFAULT NULL,
  `adt_doc_nm` varchar(32) DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `doc_type` tinyint(3) unsigned DEFAULT NULL,
  `src_inst_id` bigint(20) unsigned DEFAULT NULL,
  `src_dept_id` bigint(20) unsigned DEFAULT NULL,
  `doc_desc` varchar(255) DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_doc_auth` (
  `lgc_sn` bigint(20) unsigned DEFAULT NULL,
  `adt_doc_id` bigint(20) unsigned DEFAULT NULL,
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `auth_psn_id` bigint(20) unsigned DEFAULT NULL,
  `auth_psn_nm` varchar(10) DEFAULT NULL,
  `auth_sttm` datetime DEFAULT NULL,
  `auth_edtm` datetime DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_evt_rcrd` (
  `adt_evt_id` bigint(20) unsigned DEFAULT NULL,
  `adt_evt_nm` varchar(32) DEFAULT NULL,
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `by_inst_id` bigint(20) unsigned DEFAULT NULL,
  `untitled6` bigint(20) unsigned DEFAULT NULL,
  `adt_psn_id` bigint(20) unsigned DEFAULT NULL,
  `adt_item_id` bigint(20) unsigned DEFAULT NULL,
  `proc_desc` varchar(1000) DEFAULT NULL,
  `sttn_desc` varchar(1000) DEFAULT NULL,
  `diff_ind` tinyint(3) unsigned DEFAULT NULL,
  `diff_desc` varchar(1000) DEFAULT NULL,
  `adt_acrdto` varchar(1000) DEFAULT NULL,
  `created_dft` varchar(10) DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_evt_doc` (
  `adt_evt_id` bigint(20) unsigned DEFAULT NULL,
  `adt_doc_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_work_dft` (
  `adt_dft_id` bigint(20) unsigned DEFAULT NULL,
  `adt_dft_nm` varchar(32) DEFAULT NULL,
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `obt_inst_id` bigint(20) unsigned DEFAULT NULL,
  `untitled` bigint(20) unsigned DEFAULT NULL,
  `mjr_psn_id` bigint(20) unsigned DEFAULT NULL,
  `otr_psn_ids` varchar(1000) DEFAULT NULL,
  `sttn_desc` varchar(1000) DEFAULT NULL,
  `adt_acrdto` varchar(1000) DEFAULT NULL,
  `diff_desc` varchar(1000) DEFAULT NULL,
  `cause_anls` varchar(1000) DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `issue_ind` tinyint(3) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_dft_evt` (
  `adt_dft_id` bigint(20) unsigned DEFAULT NULL,
  `adt_evt_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_dft_doc` (
  `adt_dft_id` bigint(20) unsigned DEFAULT NULL,
  `adt_doc_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_issue` (
  `adt_issue_id` bigint(20) unsigned DEFAULT NULL,
  `adt_issue_nm` bigint(20) unsigned DEFAULT NULL,
  `issue_type` tinyint(3) unsigned DEFAULT NULL,
  `ctrl_dfct_ind` tinyint(3) unsigned DEFAULT NULL,
  `seris_dgr_ind` tinyint(3) unsigned DEFAULT NULL,
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `adt_grp_id` bigint(20) unsigned DEFAULT NULL,
  `adt_anls` varchar(1000) DEFAULT NULL,
  `adt_advc` varchar(1000) DEFAULT NULL,
  `hpn_inst_nm` bigint(20) unsigned DEFAULT NULL,
  `hpn_date` date DEFAULT NULL,
  `show_form` varchar(1000) DEFAULT NULL,
  `eft_type` varchar(1000) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_rpt` (
  `adt_rpt_id` bigint(20) unsigned DEFAULT NULL,
  `adt_rpt_nm` varchar(32) DEFAULT NULL,
  `rpt_type` tinyint(3) unsigned DEFAULT NULL,
  `rpt_desc` varchar(1000) DEFAULT NULL,
  `creater_nm` varchar(10) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_prj_rate` (
  `adt_prj_id` bigint(20) unsigned DEFAULT NULL,
  `rate` tinyint(3) unsigned DEFAULT NULL,
  `score` tinyint(3) unsigned DEFAULT NULL,
  `file_uploader_id` bigint(20) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_emp` (
  `emp_id` bigint(20) unsigned DEFAULT NULL,
  `emp_nm` varchar(10) DEFAULT NULL,
  `sex` tinyint(3) unsigned DEFAULT NULL,
  `dept_id` bigint(20) unsigned DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_inst` (
  `inst_id` bigint(20) unsigned DEFAULT NULL,
  `inst_nm` varchar(32) DEFAULT NULL,
  `parent_id` bigint(20) unsigned DEFAULT NULL,
  `parent_nm` varchar(32) DEFAULT NULL,
  `node_rte_info` varchar(255) DEFAULT NULL,
  `sort` tinyint(3) unsigned DEFAULT NULL,
  `inst_type` tinyint(3) unsigned DEFAULT NULL,
  `state` tinyint(3) unsigned DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_role` (
  `role_id` varchar(20) DEFAULT NULL,
  `role_nm` varchar(32) DEFAULT NULL,
  `stat_ind` tinyint(3) unsigned DEFAULT NULL,
  `stat_type` tinyint(3) unsigned DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `adt_trc_rctf` (
  `adt_dft_id` bigint(20) unsigned DEFAULT NULL,
  `adt_dft_nm` bigint(20) unsigned DEFAULT NULL,
  `unit` tinyint(3) unsigned DEFAULT NULL,
  `issue_num` tinyint(3) unsigned DEFAULT NULL,
  `rctf_num` tinyint(3) unsigned DEFAULT NULL,
  `issue_amt` decimal(32,10) DEFAULT NULL,
  `rctf_amt` decimal(32,10) DEFAULT NULL,
  `rctf_state` tinyint(3) unsigned DEFAULT NULL,
  `rctf_res` tinyint(3) unsigned DEFAULT NULL,
  `not_rctf_cus` tinyint(3) unsigned DEFAULT NULL,
  `issue_trk_type` tinyint(3) unsigned DEFAULT NULL,
  `rctf_date` date DEFAULT NULL,
  `rctf_desc` varchar(1000) DEFAULT NULL,
  `created_by` bigint(20) unsigned DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_by` bigint(20) unsigned DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


//以下为业务数据
--流程bpmn文件
INSERT INTO `tb_flow` (`id`,`flowname`,`flowkey`,`filepath`,`state`,`createtime`) VALUES (1,'出差申请','evection','bpmn/evection.bpmn',2,'2021-05-13');
--用户表
INSERT INTO `tb_user` (`id`,`age`,`username`,`password`,`email`,`gender`,`role`,`rolegroup`) VALUES (1,20,'jack','$2a$10$9FIX76XUZgIyiOTjy5iswe9fJrWuaxAwTLsJb0QFJAcu5OqTb/TJS','123@123.com',1,'user','activiti_user'),(2,25,'rose','$2a$10$9FIX76XUZgIyiOTjy5iswe9fJrWuaxAwTLsJb0QFJAcu5OqTb/TJS','234@234.com',2,'user','activiti_user'),(3,22,'tom','$2a$10$9FIX76XUZgIyiOTjy5iswe9fJrWuaxAwTLsJb0QFJAcu5OqTb/TJS','345@35.com',1,'user','activiti_user'),(4,30,'jerry','$2a$10$9FIX76XUZgIyiOTjy5iswe9fJrWuaxAwTLsJb0QFJAcu5OqTb/TJS','456@456.com',2,'user','activiti_user');
--demo数据结构表
DROP TABLE IF EXISTS tb_evection;
CREATE TABLE tb_evection (
id int(10) NOT NULL AUTO_INCREMENT,
evectionName varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
num double NULL DEFAULT NULL,
destination varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
begindate date NULL DEFAULT NULL,
enddate date NULL DEFAULT NULL,
reson varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
state int(4) NULL DEFAULT NULL,
userid int(20) NULL DEFAULT NULL,
PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

DROP TABLE IF EXISTS tb_flow;
CREATE TABLE tb_flow (
id int(20) NOT NULL AUTO_INCREMENT,
flowname varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
flowkey varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
filepath varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
state int(4) NULL DEFAULT NULL,
createtime date NULL DEFAULT NULL,
PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;


DROP TABLE IF EXISTS tb_sitemessage;
CREATE TABLE tb_sitemessage (
id int(20) NOT NULL AUTO_INCREMENT,
userid int(20) NULL DEFAULT NULL,
type int(10) NULL DEFAULT NULL,
content varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
isread int(4) NULL DEFAULT NULL,
createtime date NULL DEFAULT NULL,
updatetime date NULL DEFAULT NULL,
taskid varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user (
id int(11) NOT NULL AUTO_INCREMENT,
age int(40) NULL DEFAULT NULL,
username varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
password varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
email varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
gender int(40) NULL DEFAULT NULL,
role varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
rolegroup varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;