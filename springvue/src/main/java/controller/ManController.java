package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Item;
import repository.ItemRepository;

@RestController
public class ManController {
	
	@Autowired
	                    ItemRepository itemRepository;
	
	@GetMapping("/api/test")
	public List<Item> gettest() {
		List<Item> items = itemRepository.findAll();
		
		return items;
	}
}
