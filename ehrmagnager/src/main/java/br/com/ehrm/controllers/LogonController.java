package br.com.ehrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.ehrm.model.Environment;
import br.com.ehrm.repository.EnvironmentRepository;
import br.com.ehrm.vo.SignInVO;

@Controller
public class LogonController {

	@Autowired
	private EnvironmentRepository environmentRepository;

	@RequestMapping(value = "/logon")
	public String sign(Model model) {
		// model.addAttribute("tenantid", tenantid);
		model.addAttribute("signInVO", new SignInVO());

		// redirectAttributes.addAttribute("context", signInVO.getSiteName());
		// redirectAttributes.addFlashAttribute("signInVO", signInVO);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);

		// redirectView.setUrl("/panel/{context}");

		// return redirectView;

		return "logon";
	}

	@RequestMapping(value = "/logon", method = RequestMethod.POST)
	public RedirectView getLogonEnviroment(Model model, SignInVO signInVO) {
		Environment logonEnviroment = this.environmentRepository.getLogonEnviroment(signInVO.getUserName(),
				signInVO.getPassword());
		model.addAttribute("tenantid", logonEnviroment.getTenantyId());

		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/panel");

		return redirectView;

	}

}
