# springboot-wk
包含四个项目模块
rabbitmq：mq项目；主要有mq监控类，rabbitmq服务器连接配置，消费者调用dubbo配置。
springboot-one是api：也就是controller所在的，主要要调用的消费者dubbo配置；提供给前端调用的api接口；
springboot-service：如名，就是service，interface接口，这个接口会被打为jar供api和实现依赖，
springboot：interface实现类，包含interface实现类，dao，daoMapper，dubbo配置，把interface注册到zk暴露接口给mq，controler调用
