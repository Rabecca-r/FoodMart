package com.example.foodmart.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/foodmart/data/repository/FoodRepositoryImpl;", "Lcom/example/foodmart/data/repository/FoodRepository;", "api", "Lcom/example/foodmart/data/remote/FoodApiService;", "(Lcom/example/foodmart/data/remote/FoodApiService;)V", "getFoodItemsWithCategories", "", "Lcom/example/foodmart/data/model/FoodItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FoodRepositoryImpl implements com.example.foodmart.data.repository.FoodRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.foodmart.data.remote.FoodApiService api = null;
    
    public FoodRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.foodmart.data.remote.FoodApiService api) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getFoodItemsWithCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodmart.data.model.FoodItem>> $completion) {
        return null;
    }
}