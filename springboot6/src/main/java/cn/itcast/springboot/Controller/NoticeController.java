package cn.itcast.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeController
 * 
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午8:46:15
 * @version 1.0
 */
@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@GetMapping("/findAll")
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
}
