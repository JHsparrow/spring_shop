package com.myshop.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.myshop.constant.ItemSellStatus;
import com.myshop.entity.Item;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class ItemRepositoryTest {

	@Autowired
	ItemRepository itemRepository;
	
	
	public void createItemTest() {
		for(int i=1; i<=10; i++) {
			Item item = new Item();
			item.setItemNm("테스트 상품"+i);
			item.setPrice(10000);
			item.setItemDetail("테스트 상품 설명"+i);
			item.setItemSellStatus(ItemSellStatus.SELL);
			item.setStockNumber(100);
			item.setRegTime(LocalDateTime.now());
			item.setUpdatetime(LocalDateTime.now());
			Item saveItem = itemRepository.save(item);
		}
	}
//	@Test
//	@DisplayName("상품 조회 테스트")
//	public void findByItemTest() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByItemNm("테스트 상품1");
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//		
//	}
//	
//	@Test
//	@DisplayName("상품 조회 or 테스트")
//	public void findByItemOrDetailTest() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByItemNmOrItemDetail("테스트 상품1","테스트 상품 상세5");
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
//	
//	@Test
//	@DisplayName("상품 조회 order 테스트")
//	public void findByPriceLessThanOrderByPriceDescTest() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByPriceLessThanOrderByPriceDesc(15000);
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
	


//	itemSellStatus가 null이 아닌 레코드를 구하는 Juinit 테스트 코드를 완성하시오.
//	itemDetail이 설명1로 끝나는 레코드를 구하는 Junit 테스트 코드를 완성하시오.

//	@Test
//	@DisplayName("퀴즈1-1")
//	public void findByItemOrDetailTest() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByItemNmOrItemDetail("테스트 상품1","Sell");
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
	
//	@Test
//	@DisplayName("퀴즈1-2")
//	public void findByItemOrDetailTest() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByPriceBetween(10004,10008);
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
	
//	@Test
//	@DisplayName("퀴즈1-3")
//	public void findByRegTime() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByRegTimeGreaterThan("2023-1-1 12:12:44");
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
	
//	@Test
//	@DisplayName("퀴즈1-4")
//	public void findByRegTime() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByItemSellStatusNotNull();
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
	
//	@Test
//	@DisplayName("퀴즈1-5")
//	public void findByRegTime() {
//		this.createItemTest();
//		List<Item> itemList = itemRepository.findByItemDetailEndsWith("설명1");
//		for(Item item : itemList) {
//			System.out.println(item.toString());
//		}
//	}
	
	
}
