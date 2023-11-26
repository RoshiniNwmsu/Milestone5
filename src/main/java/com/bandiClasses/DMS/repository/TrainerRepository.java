/**
 * 
 */
package com.bandiClasses.DMS.repository;
/**
* @author Roshini Bikkina
* S559200
*/

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Trainer;


public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	

}
