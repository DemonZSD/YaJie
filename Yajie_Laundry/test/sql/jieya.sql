/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.21-log : Database - jieya
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jieya` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jieya`;

/*Table structure for table `admin_table` */

DROP TABLE IF EXISTS `admin_table`;

CREATE TABLE `admin_table` (
  `id` char(50) NOT NULL COMMENT 'ID',
  `loginname` char(50) DEFAULT NULL COMMENT '用户名',
  `password` char(50) DEFAULT NULL COMMENT '密码',
  `mobile` char(20) DEFAULT NULL COMMENT '手机号',
  `name` char(50) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_table` */

insert  into `admin_table`(`id`,`loginname`,`password`,`mobile`,`name`) values ('1','admin','dcddb75469b4b4875094e14561e573d8','15656988631','朱世栋');

/*Table structure for table `company_table` */

DROP TABLE IF EXISTS `company_table`;

CREATE TABLE `company_table` (
  `cid` char(50) NOT NULL COMMENT '公司ID',
  `caddr` char(255) DEFAULT NULL COMMENT '公司地址',
  `cname` char(255) DEFAULT NULL COMMENT '公司名称',
  `cchargePerson` char(50) DEFAULT NULL COMMENT '公司负责人',
  `cchargePersonMobile` char(30) DEFAULT NULL COMMENT '负责人手机号',
  `cchargePersonTel` char(30) DEFAULT NULL COMMENT '负责人座机号',
  `remark` char(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `company_table` */

/*Table structure for table `orders_table` */

DROP TABLE IF EXISTS `orders_table`;

CREATE TABLE `orders_table` (
  `oid` char(50) NOT NULL COMMENT '订单ID',
  `onumber` char(50) DEFAULT NULL COMMENT '订单号',
  `uid` char(50) DEFAULT NULL COMMENT '用户ID',
  `uname` char(255) DEFAULT NULL COMMENT '用户姓名',
  `umobile` char(255) DEFAULT NULL COMMENT '用户电话号码',
  `odate` char(50) DEFAULT NULL COMMENT '订单日期',
  `preTakeDate` char(50) DEFAULT NULL COMMENT '预约取衣服日期',
  `takeDate` char(50) DEFAULT NULL COMMENT '实际取衣服日期',
  `amount` decimal(10,0) DEFAULT '0' COMMENT '订单金额',
  `isSettle` int(1) DEFAULT '0' COMMENT '是否结清（0:未结清 1:结清 2:订单取消 3:其他）',
  `remark` char(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`oid`),
  KEY `uid` (`uid`),
  CONSTRAINT `orders_table_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user_table` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders_table` */

/*Table structure for table `product_table` */

DROP TABLE IF EXISTS `product_table`;

CREATE TABLE `product_table` (
  `pid` char(50) DEFAULT NULL COMMENT '物品ID',
  `pname` char(255) DEFAULT NULL COMMENT '物品名称',
  `wid` char(50) DEFAULT NULL COMMENT '所属分类ID',
  `wname` char(255) DEFAULT NULL COMMENT '所属分类名称',
  `uid` char(50) DEFAULT NULL COMMENT '所属用户ID',
  `uname` char(255) DEFAULT NULL COMMENT '所属用户姓名',
  `oid` char(50) DEFAULT NULL COMMENT '所属订单ID',
  `count` int(10) DEFAULT NULL COMMENT '衣物数量',
  `price` decimal(10,0) DEFAULT '0' COMMENT '洗衣单价',
  `remark` char(50) DEFAULT NULL COMMENT '备注',
  KEY `wid` (`wid`),
  KEY `uid` (`uid`),
  KEY `oid` (`oid`),
  CONSTRAINT `product_table_ibfk_1` FOREIGN KEY (`wid`) REFERENCES `wash_class_table` (`wid`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `product_table_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `user_table` (`uid`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `product_table_ibfk_3` FOREIGN KEY (`oid`) REFERENCES `orders_table` (`oid`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_table` */

/*Table structure for table `system_table` */

DROP TABLE IF EXISTS `system_table`;

CREATE TABLE `system_table` (
  `id` varchar(50) NOT NULL COMMENT 'ID',
  `systemname` varchar(255) DEFAULT NULL COMMENT '系统名称',
  `contactname` varchar(50) DEFAULT NULL COMMENT '联系人名字',
  `contacttel` varchar(50) DEFAULT NULL COMMENT '联系固话',
  `contactmobile1` varchar(20) DEFAULT NULL COMMENT '联系电话1',
  `contactmobile2` varchar(20) DEFAULT NULL COMMENT '联系电话2',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `system_table` */

/*Table structure for table `user_table` */

DROP TABLE IF EXISTS `user_table`;

CREATE TABLE `user_table` (
  `uid` char(50) NOT NULL COMMENT '用户ID',
  `username` char(50) DEFAULT NULL COMMENT '姓名',
  `password` char(255) DEFAULT NULL COMMENT '密码',
  `umobile` char(20) DEFAULT NULL COMMENT '手机号',
  `utelphone` char(20) DEFAULT NULL COMMENT '固定电话',
  `umobile_bak` char(20) DEFAULT NULL COMMENT '备用手机号',
  `uhomeAddr` char(255) DEFAULT NULL COMMENT '家庭住址',
  `companyid` char(50) DEFAULT NULL COMMENT '所属公司ID',
  `companyName` char(255) DEFAULT NULL COMMENT '公司名称',
  `ucompanyAddr` char(255) DEFAULT NULL COMMENT '公司地址',
  `addDate` char(50) DEFAULT NULL COMMENT '添加日期',
  `remark` char(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_table` */

insert  into `user_table`(`uid`,`username`,`password`,`umobile`,`utelphone`,`umobile_bak`,`uhomeAddr`,`companyid`,`companyName`,`ucompanyAddr`,`addDate`,`remark`) values ('111','admin','e10adc3949ba59abbe56e057f20f883e','15656988631','055165800135','zsd','中国银行','1','中国银行','中国银行',NULL,NULL);

/*Table structure for table `wash_class_table` */

DROP TABLE IF EXISTS `wash_class_table`;

CREATE TABLE `wash_class_table` (
  `wid` char(50) NOT NULL COMMENT 'ID',
  `wtype` char(3) DEFAULT NULL COMMENT '衣物类别代码',
  `wname` char(50) DEFAULT NULL COMMENT '衣物类别名称',
  `wparendId` char(50) DEFAULT NULL COMMENT '父类ID',
  `washMode` char(20) DEFAULT NULL COMMENT '洗衣方式',
  `remark` char(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`wid`),
  KEY `wparendId` (`wparendId`),
  CONSTRAINT `wash_class_table_ibfk_1` FOREIGN KEY (`wparendId`) REFERENCES `wash_class_table` (`wid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='干洗物类别';

/*Data for the table `wash_class_table` */

insert  into `wash_class_table`(`wid`,`wtype`,`wname`,`wparendId`,`washMode`,`remark`) values ('1','2','3',NULL,'2','1'),('2','3','4','1','2','2');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
