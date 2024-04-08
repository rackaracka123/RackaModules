import androidx.compose.ui.window.ComposeUIViewController
import net.rackaracka.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
