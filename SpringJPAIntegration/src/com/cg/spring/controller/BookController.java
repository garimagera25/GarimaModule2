package com.cg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.spring.entities.Author;
import com.cg.spring.entities.BookDetails;
import com.cg.spring.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	public BookService getService() {
		return service;
	}

	public void setService(BookService service) {
		this.service = service;
	}

	@RequestMapping("addBookPage")
	public String showAddBookPage(Model model){
		BookDetails book= new BookDetails();
		List<Author> list= service.getAuthorList();
		model.addAttribute("authorList", list);
		model.addAttribute("book", book);
		return "AddBookDetails";
	}
	
	@RequestMapping("/insertBook")
	public String insertBookRecord(Model model,
			@ModelAttribute("book") BookDetails book){
		book= service.addBookDetails(book);
		model.addAttribute("book", book);
		return "Success";
	}
	@RequestMapping("getBookListPage")
	public String getBookList(Model model){
		
		List<BookDetails> list= service.getBookList();
		model.addAttribute("bookList", list);
		return "BookList";
	}
	@RequestMapping("showUpdateBookPage")
	public String showUpdatePage(Model model,
			@RequestParam("bookid") int bookid){
		BookDetails book= service.getBookDetails(bookid);
		model.addAttribute("book", book);
		return "UpdateBook";
	}
	@RequestMapping("updateBook")
	public String updateBookRecord(Model model,
			@ModelAttribute("book") BookDetails book){
		
	//	service.updateBook(book);
		List<BookDetails> list= service.getBookList();
		model.addAttribute("bookList", list);
	
		return "BookList";
	}
	@RequestMapping("DeleteBookPage")
	public String removeBook(Model model,@RequestParam("bookid") int bookid ){
		service.removeBook(bookid);
		List<BookDetails> list= service.getBookList();
		model.addAttribute("bookList", list);
		return "BookList";
	}
	
	@RequestMapping("getYearPage")
	public String showYearRangePage(){
		return "BookYearRange";
	}
	
	@RequestMapping("getBookYearRange")
	public String retriveBooksYearwise(Model model,@RequestParam("year1") int year1,
			@RequestParam("year2") int year2){
		System.out.println(year1 + " "+ year2);
			
			List<BookDetails> list=service.getBookList(year1, year2);
			model.addAttribute("bookList", list);
			return "BookYearRange";
}
}
