package cn.itcast.springboot.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.itcast.springboot.entity.Notice;

/**
 * NoticeDao
 * 
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午8:44:55
 * @version 1.0
 */
@Repository
public interface NoticeDao extends JpaRepository<Notice, Long> {

}
