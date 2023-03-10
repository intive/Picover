package com.intive.picover.profile.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.intive.picover.R

@Composable
fun ProfileScreen() {
	Box(
		modifier = Modifier.fillMaxSize(),
	) {
		Text(
			text = stringResource(id = R.string.Profile),
			modifier = Modifier.align(Alignment.Center),
		)
	}
}
