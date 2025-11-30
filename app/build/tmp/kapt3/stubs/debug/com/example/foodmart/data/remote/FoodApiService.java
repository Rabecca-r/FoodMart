package com.example.foodmart.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/example/foodmart/data/remote/FoodApiService;", "", "getFoodCategories", "", "Lcom/example/foodmart/data/model/FoodCategoryDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFoodItems", "Lcom/example/foodmart/data/model/FoodItemDto;", "Companion", "app_debug"})
public abstract interface FoodApiService {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://7shifts.github.io/mobile-takehome/api/";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.foodmart.data.remote.FoodApiService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "food_items.json")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFoodItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodmart.data.model.FoodItemDto>> $completion);
    
    @retrofit2.http.GET(value = "food_item_categories.json")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFoodCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodmart.data.model.FoodCategoryDto>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/foodmart/data/remote/FoodApiService$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://7shifts.github.io/mobile-takehome/api/";
        
        private Companion() {
            super();
        }
    }
}