package br.com.infoprice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class GenericService<T> {
	
	@Autowired
    protected JpaRepository<T, Long> _repository;
    
    public GenericService(JpaRepository<T, Long> repo){
        this._repository = repo;
    }

	public List<T> list() {
		return _repository.findAll();
	}

	public T register(T obj) {
		return _repository.save(obj);
	}

	public T edit(T newObj) {
		return _repository.save(newObj);
	}    

	public boolean delete(Long id) {
		Optional<T> opt = _repository.findById(id);
        if(opt.isPresent()){
            _repository.delete(opt.get());
            return true;
		}
		return false;
	}

	public T findById(Long id) {
		Optional<T> oldOpt = _repository.findById(id);
        if(oldOpt.isPresent()){
			T obj = oldOpt.get();
            return obj;
		}
		return null;
	}
}
