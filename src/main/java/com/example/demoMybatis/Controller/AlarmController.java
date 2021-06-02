package com.example.demoMybatis.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demoMybatis.Mapper.AlarmMapper;
import com.example.demoMybatis.Model.Alarm;
import com.example.demoMybatis.Model.AlarmExample;

@Controller
public class AlarmController {

	@Autowired
	private AlarmMapper alarmMapper;

	
	@GetMapping("/createAlarm")
	public String addNewAlarm( Model model) {
		model.addAttribute("alarm", new Alarm());
		return "alarm_managerment";
	}
	
    @PostMapping("/createAlarm")
	public String addNewAlarm(Model model,Alarm alarm) {
		alarmMapper.insert(alarm);
		return "redirect:/createAlarm";
	}

	@GetMapping("/history")
	public String viewPageHistory(Model model) {
		AlarmExample alarmExample = new AlarmExample();
		List<Alarm> listAlarm = alarmMapper.selectByExample(alarmExample);
		model.addAttribute("listAlarm", listAlarm);
		return "history";
	}
}
