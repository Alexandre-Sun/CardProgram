package org.sid.api.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bins")
public class BinController {
	
	@Autowired
	private BinService binService;
	
	@GetMapping("/listBins")
	public Iterable<Bin> getBin() {
		return binService.getBins();
	}


}
