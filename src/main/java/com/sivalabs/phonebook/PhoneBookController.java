/**
 * 
 */
package com.sivalabs.phonebook;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author skatam
 *
 */
@Controller
public class PhoneBookController
{
	private PhoneBookService phoneBookService;
	@Autowired
	public void setPhoneBookService(PhoneBookService phoneBookService)
	{
		this.phoneBookService = phoneBookService;
	}
	
	@RequestMapping(value="/showContacts")
	public ModelAndView showContacts(@RequestParam("userId") int userId)
	{
		ModelAndView mav = new ModelAndView("showContacts");
		Collection<Contact> contacts = this.phoneBookService.getAllUserContacts(userId);
		mav.getModel().put("CONTACTS_KEY", contacts);
		return mav;
	}
	
	@RequestMapping(value="/searchContacts")
	public ModelAndView searchContacts(@RequestParam("userId") int userId, @RequestParam("name") String name)
	{
		ModelAndView mav = new ModelAndView("showContacts");
		Collection<Contact> contacts = this.phoneBookService.searchUserContacts(userId, name);
		mav.getModel().put("CONTACTS_KEY", contacts);
		return mav;
	}
	
	@RequestMapping(value="/createContact", method=RequestMethod.GET)
	public ModelAndView showNewContactForm()
	{
		ModelAndView mav = new ModelAndView("newContact");
		Contact contact = new Contact();
		mav.getModel().put("newContact", contact);
		return mav;
	}
	
	@RequestMapping(value="/createContact", method=RequestMethod.POST)
	public ModelAndView createContact(@ModelAttribute("newContact") Contact contact)
	{
		ModelAndView mav = new ModelAndView("redirect:showContacts.do");
		this.phoneBookService.create(contact);
		return mav;
	}
	
	@RequestMapping(value="/updateContact", method=RequestMethod.GET)
	public ModelAndView editContactForm(@RequestParam("contactId") int id)
	{
		ModelAndView mav = new ModelAndView("editContact");
		Contact contact = this.phoneBookService.getById(id);
		mav.getModel().put("editContact", contact);
		return mav;
	}
	
	@RequestMapping(value="/updateContact", method=RequestMethod.POST)
	public ModelAndView updateContact(@ModelAttribute("editContact") Contact contact)
	{
		ModelAndView mav = new ModelAndView("redirect:showContacts.do");
		this.phoneBookService.update(contact);
		return mav;
	}
	
	@RequestMapping("/deleteContact")
	public ModelAndView deleteContact(@RequestParam("contactId") int id)
	{
		ModelAndView mav = new ModelAndView("redirect:showContacts.do");
		Contact contact = new Contact();
		contact.setContactId(id);
		this.phoneBookService.delete(contact);
		return mav;
	}
}
