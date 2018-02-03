package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.entity.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午8:45:38
 * @version 1.0
 */
public interface NoticeService {

	List<Notice> findAll();

}
