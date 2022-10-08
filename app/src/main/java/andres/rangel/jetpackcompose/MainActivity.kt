package andres.rangel.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(20.dp)) {
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part2RowsColumnsAndBasicSizingActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Rows, columns and basic sizing")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part3ModifiersActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Modifiers")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part4ImageCardActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Image card")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part5StylingTextActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Styling text")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part6StatesActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "State")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part7TextfieldsButtonsAndSnackbarsActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Textfields, buttons and snackbars")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part8ListsActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Lists")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part9ConstraintLayoutActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Constraint layout")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part10SideEffectsAndEffectHandlersActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Side effects and effect handler")
                }
                Button(
                    onClick = {
                        startActivity(
                            Intent(
                                this@MainActivity,
                                Part11SimpleAnimationsActivity::class.java
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Text(text = "Simple animations")
                }
            }
        }
    }
}