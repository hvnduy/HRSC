package com.tss.enterprise.hrsc.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tss.enterprise.hrsc.model.vo.DataStatesModel;
import com.tss.enterprise.hrsc.model.vo.OrderLineModel;
import com.tss.enterprise.hrsc.utils.MASSException;
import com.tss.enterprise.hrscservice.DataStatesService;

@Controller
public class OrderEntryController {

	public static final Logger LOG = Logger.getLogger(OrderEntryController.class);

	/**
	 * Create constant variable OFFLINE_ORDER_STATES.
	 */
	private static final String STATE_AUTOCOMPLETE = "/autoCompleteStates";

	@Autowired
	private DataStatesService dataStatesService;

	//@Autowired
	//private PropertiesMap statesMapping;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = {STATE_AUTOCOMPLETE}, method = RequestMethod.GET)
	@ResponseBody
	public List<DataStatesModel> getStates() throws MASSException{
		return this.dataStatesService.getStates();
	}

	@RequestMapping(value = "insertOrder", method = RequestMethod.GET)
	@ResponseBody
	public void insertOrder(@ModelAttribute(value = "orderLineModel") OrderLineModel orderLineModel) throws MASSException {
		this.messageSource.getMessage("userName", null, Locale.ENGLISH);
	}

	/**
	 * Handles any home page case.
	 * @param model
	 *            Attributes set to jsp
	 * @return the tile for the home page
	 */
	@RequestMapping(value = "/orderEntry", method = RequestMethod.GET)
	public String mainPage(ModelMap model) {
		return "orderEntry.tile";
	}


	@RequestMapping(value = "/updateOrder", method = RequestMethod.GET)
	@ResponseBody
	public void updateOrder(HttpServletRequest request, HttpSession session, @RequestParam(value = "orderNumber", required = false) final String orderNumber) throws MASSException {

	}

}
