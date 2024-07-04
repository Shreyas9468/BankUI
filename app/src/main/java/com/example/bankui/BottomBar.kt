package com.example.bankui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.bankui.data.BottomNavigation

val list = listOf(
    BottomNavigation(
        title = "Home",
        imageVector = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Wallet",
        imageVector = Icons.Rounded.Wallet
    ),
    BottomNavigation(
        title = "Notifications",
        imageVector = Icons.Rounded.Notifications
    ),
    BottomNavigation(
        title = "Account",
        imageVector = Icons.Rounded.AccountCircle
    ),

    )

@Composable
fun BottomBar() {

    NavigationBar {
        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {
            list.forEachIndexed { index, item ->


                NavigationBarItem(selected = index == 0, onClick = {  }, icon = {

                    Icon(imageVector = item.imageVector, contentDescription = item.title,
                        tint = MaterialTheme.colorScheme.background)

                },
                    label = {
                        Text(text = item.title,
                            color = MaterialTheme.colorScheme.onBackground)

                    })
                    
                
            }
        }
    }


}