import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mojifilmovi.app_ui.GuessMovieViewModel
import com.example.mojifilmovi.app_ui.MojiFilmoviViewModel
import com.example.mojifilmovi.app_ui.MojiFilmoviViewModelFactory
import com.example.mojifilmovi.app_ui.MovieQuizViewModel
import com.example.mojifilmovi.data.MoviesDatabase
import com.example.mojifilmovi.data.OfflineMoviesRepository
import com.example.mojifilmovi.screens.AboutScreen
import com.example.mojifilmovi.screens.AddMovieScreen
import com.example.mojifilmovi.screens.GameScreen
import com.example.mojifilmovi.screens.HomeMojiFilmoviScreen
import com.example.mojifilmovi.screens.HomeScreen
import com.example.mojifilmovi.screens.MovieQuizScreen
import com.example.mojifilmovi.screens.ResultScreen
import com.example.mojifilmovi.screens.shareScore

@Composable
fun Navigation(navController: NavHostController, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val repository = provideMoviesRepository(context)
    val viewModelFactory = MojiFilmoviViewModelFactory(repository)
    val mojiFilmoviViewModel: MojiFilmoviViewModel = viewModel(factory = viewModelFactory)

    val movieQuizViewModel: MovieQuizViewModel = viewModel()
    val guessMovieViewModel: GuessMovieViewModel = viewModel()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("quiz") { MovieQuizScreen(movieQuizViewModel, navController) }
        composable("guess_movie") { GameScreen(guessMovieViewModel, navController) }

        composable("result/{score}/{gameType}") { backStackEntry ->
            val score = backStackEntry.arguments?.getString("score")?.toIntOrNull() ?: 0
            val gameType = backStackEntry.arguments?.getString("gameType") ?: "kviza"
            ResultScreen(
                navController = navController,
                score = score,
                gameType = gameType,
                onRestart = {
                    navController.navigate("quiz") {
                        popUpTo("home") { inclusive = false }
                    }
                },
                onShare = {
                    shareScore(context, score, gameType)
                }
            )
        }

        composable("app_info") {
            AboutScreen(navController = navController)
        }

        composable("moji_filmovi") {
            HomeMojiFilmoviScreen(
                navController = navController,
                viewModel = mojiFilmoviViewModel
            )
        }

        composable("dodaj_film") {
            AddMovieScreen(
                navController = navController,
                viewModel = mojiFilmoviViewModel
            )
        }
    }
}

private fun provideMoviesRepository(context: Context): OfflineMoviesRepository {
    val database = MoviesDatabase.getDatabase(context)
    return OfflineMoviesRepository(database.movieDao())
}




