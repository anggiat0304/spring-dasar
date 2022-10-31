/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import programmerjamannow.core.repository.CategoryRepository;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: CategoryService.java, v 0.1 2022‐10‐29 22.54 anggiat.pangaribuan Exp $$
 */
@Component
public class CategoryService {
    private CategoryRepository categoryRepository;

    /**
     * Setter method for property categoryRepository.
     *
     * @param categoryRepository value to be assigned to property categoryRepository
     */
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}