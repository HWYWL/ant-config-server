--
-- 由SQLiteStudio v3.1.1 产生的文件 周六 3月 4 01:05:21 2017
--
-- 文本编码：UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- 表：t_config_service 配置中心核心表
DROP TABLE IF EXISTS t_config_service;
CREATE TABLE t_config_service (id INTEGER PRIMARY KEY UNIQUE NOT NULL,
  module VARCHAR (100) NOT NULL, -- '模块'
  key VARCHAR (100) NOT NULL, -- 'key'
  value VARCHAR (255) NOT NULL, -- 值
  describe VARCHAR (255), --'描述'
  operator VARCHAR (64), -- '操作人'
  create_time DATE , -- '创建时间'
  update_time DATE , --'更新时间'
  status INTEGER (10) NOT NULL DEFAULT 1);-- '状态：0:无效 1：有效'

-- 表：t_users 用户表
DROP TABLE IF EXISTS t_users;
CREATE TABLE t_users (uid INTEGER PRIMARY KEY UNIQUE NOT NULL,
  username VARCHAR (64) UNIQUE NOT NULL,
  password VARCHAR (64) NOT NULL,
  name VARCHAR (100),
  email VARCHAR (100),
  qq VARCHAR (64),
  phone VARCHAR (64),
  create_time DATE , -- '创建时间'
  update_time DATE );--'更新时间'

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
