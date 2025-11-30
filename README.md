A modern Android application built with Kotlin and Jetpack Compose.
FoodMart showcases clean UI architecture, responsive layouts, reusable components, and modern best practices in Compose.

Overview

The application displays a collection of food items in a two-column grid layout. Each item includes:

Image
Price
Name
Category label
Placeholder action icon

The user interface is styled using Material 3 theming, custom colours, and responsive sizing.

Features
Food Items Grid
Implemented using LazyVerticalGrid for responsive layout.
Reusable composable card component for displaying individual items.
Structured spacing, padding, and typography consistent with Material 3 guidelines.

Top Bar
Displays app title and a filter action icon.
Uses Material 3 TopAppBar and theming for a cohesive appearance.

Splash Screen and Branding
Integrated with the latest Android SplashScreen API.
Custom adaptive icons and branded launch experience.

Theming
Custom colour palette 
Material 3 typography and component styling.

Technology Stack -->

Kotlin
Jetpack Compose
ViewModel (state holder)
UI Design System:	Material 3
Build System: Gradle

Project Structure -->

app/src/main/java/com/example/foodmart/

Contains all Kotlin source files:

screen/ – Jetpack Compose UI screens
theme/ – color palette, typography, shapes, and MaterialTheme configuration
model/ – data models used in the UI
MainActivity.kt – main entry activity
app/src/main/res/

Contains all Android resources:
drawable/ – icons, splash image, placeholder assets
mipmap/ – launcher icon assets
values/ – colors, themes, styles XML

How to Run: 
1. Clone the repository
2. Open the project in Android Studio Hedgehog or newer.

Run the application on an emulator or physical device running Android 8.0 or above
