package io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.service;


import io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.domain.GroceryItemResource;
import io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.domain.dto.GroceryItemRecord;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IGroceryItemsManagementService {

    Mono<GroceryItemResource> insertOne(GroceryItemRecord groceryItemRecord);

    Flux<GroceryItemResource> findAll();

    Mono<GroceryItemResource> findOneBy(String id);

    Mono<GroceryItemResource> findOneAndUpdate(String id, GroceryItemRecord groceryItemRecord);

    Mono<Void> findOneAndDelete(String id);
}
