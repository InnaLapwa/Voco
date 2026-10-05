package com.example.voco

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.voco.catalog.WordCatalogImpl
import com.example.voco.data.VocoData
import com.example.voco.model.Word
import com.example.voco.model.WordCategory
import com.example.voco.search.EnglishWordSearcher
import com.example.voco.typeSystem.findWord
import com.example.voco.typeSystem.printInfo
import com.example.voco.typeSystem.wordNotFound
import com.example.voco.ui.theme.VocoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VocoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        val vocoObject = VocoData
        val wordSearcher = EnglishWordSearcher()
        val wordCatalog = WordCatalogImpl(wordSearcher)
        vocoObject.wordList.forEach {
            wordCatalog.add(it)
        }
        Log.d("test", wordCatalog.getAll().toString())
        Log.d("test", wordCatalog.find("Two").toString())
        Log.d("test", wordCatalog.find("Nine").toString())

        val testWord = Word("One", "Один", "One example", WordCategory.NUMBERS)

        printInfo("Hello")
        printInfo(42)
        printInfo(testWord)

        findWord(testWord)
        findWord(null)

        wordNotFound(testWord)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VocoTheme {
        Greeting("Android")
    }
}