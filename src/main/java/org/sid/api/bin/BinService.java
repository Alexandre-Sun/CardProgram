package org.sid.api.bin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class BinService {

	@Autowired
	private BinRepository binRepository;
	
	public Optional<Bin> getBin(final Long id){
		return binRepository.findById(id);
	}
	
	public Iterable<Bin> getBins(){
		return binRepository.findAll();
	}
	
	public void deleteBin(final Long id) {
		binRepository.deleteById(id);
	}
	
	public Bin saveBin(Bin bin) {
		Bin savedBin = binRepository.save(bin);
		return savedBin;
	}
	
}
