package com.algaworks.algashop.product.catalog.infrastructure.listener.category;

import com.algaworks.algashop.product.catalog.application.category.event.CategoryUpdatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CategoryEventListener {

    @EventListener
    public void handle(CategoryUpdatedEvent categoryUpdatedEvent) {
        log.info("Category updated received: {}", categoryUpdatedEvent.getCategoryId());
    }

}
