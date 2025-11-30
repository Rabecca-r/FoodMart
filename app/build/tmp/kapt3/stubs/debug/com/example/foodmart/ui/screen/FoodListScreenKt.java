package com.example.foodmart.ui.screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a&\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001aT\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a\u001e\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a*\u0010\u0019\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u0003\u001a$\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u0007\u001a\b\u0010\u001f\u001a\u00020\u0001H\u0003\u00a8\u0006 "}, d2 = {"ErrorState", "", "message", "", "onRetry", "Lkotlin/Function0;", "FilterRow", "category", "Lcom/example/foodmart/data/model/FoodCategory;", "selected", "", "onToggle", "FilterSheetContent", "categories", "", "selectedIds", "", "onCategoryToggle", "Lkotlin/Function1;", "onClear", "onClose", "FoodItemCard", "foodItem", "Lcom/example/foodmart/data/model/FoodItem;", "onClick", "FoodItemsGrid", "items", "onItemClick", "FoodListScreen", "viewModel", "Lcom/example/foodmart/ui/screen/FoodListViewModel;", "LoadingGridSkeleton", "app_debug"})
public final class FoodListScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void FoodListScreen(@org.jetbrains.annotations.NotNull()
    com.example.foodmart.ui.screen.FoodListViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    /**
     * 2-column grid of food cards to be displayed neatly.
     */
    @androidx.compose.runtime.Composable()
    private static final void FoodItemsGrid(java.util.List<com.example.foodmart.data.model.FoodItem> items, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    /**
     * Single food item card: image + price + name + category.
     */
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    @androidx.compose.runtime.Composable()
    private static final void FoodItemCard(com.example.foodmart.data.model.FoodItem foodItem, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    /**
     * Skeleton grid while loading.
     */
    @androidx.compose.runtime.Composable()
    private static final void LoadingGridSkeleton() {
    }
    
    /**
     * Centered error state when API fails.
     */
    @androidx.compose.runtime.Composable()
    private static final void ErrorState(java.lang.String message, kotlin.jvm.functions.Function0<kotlin.Unit> onRetry) {
    }
    
    /**
     * Bottom sheet with category switches.
     */
    @androidx.compose.runtime.Composable()
    private static final void FilterSheetContent(java.util.List<com.example.foodmart.data.model.FoodCategory> categories, java.util.Set<java.lang.String> selectedIds, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCategoryToggle, kotlin.jvm.functions.Function0<kotlin.Unit> onClear, kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
    }
    
    /**
     * Single category row with switch.
     */
    @androidx.compose.runtime.Composable()
    private static final void FilterRow(com.example.foodmart.data.model.FoodCategory category, boolean selected, kotlin.jvm.functions.Function0<kotlin.Unit> onToggle) {
    }
}