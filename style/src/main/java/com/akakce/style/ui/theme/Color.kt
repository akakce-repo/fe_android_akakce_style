package com.akakce.style.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * @Author: Selim Simsek
 * @Date: 4.08.2022
 */
class AkakceColors(
    akakceBlueGray600: Color,
    akakceBlueGray500: Color,
    akakceBlueGray400: Color,
    akakceBlueGray300: Color,
    akakceBlueGray200: Color,
    akakceBlueGray100: Color,
    akakceBlueGray50: Color,
    akakceDarkBlue: Color,
    akakceRegularBlue: Color,
    akakceBaseBlue: Color,
    akakceTintBlue: Color,
    akakceBaseOrange: Color,
    akakceTintOrange: Color,
    akakceBaseGreen: Color,
    akakceTintGreen: Color,
    akakceBaseRed: Color,
    akakceTintRed: Color,
    akakceBasePurple: Color,
    akakceTintPurple: Color,
    isLight: Boolean
) {
    var akakceBlueGray600 by mutableStateOf(akakceBlueGray600)
        private set
    var akakceBlueGray500 by mutableStateOf(akakceBlueGray500)
        private set
    var akakceBlueGray400 by mutableStateOf(akakceBlueGray400)
        private set
    var akakceBlueGray300 by mutableStateOf(akakceBlueGray300)
        private set
    var akakceBlueGray200 by mutableStateOf(akakceBlueGray200)
        private set
    var akakceBlueGray100 by mutableStateOf(akakceBlueGray100)
        private set
    var akakceBlueGray50 by mutableStateOf(akakceBlueGray50)
        private set
    var akakceDarkBlue by mutableStateOf(akakceDarkBlue)
        private set
    var akakceRegularBlue by mutableStateOf(akakceRegularBlue)
        private set
    var akakceBaseBlue by mutableStateOf(akakceBaseBlue)
        private set
    var akakceTintBlue by mutableStateOf(akakceTintBlue)
        private set
    var akakceBaseOrange by mutableStateOf(akakceBaseOrange)
        private set
    var akakceTintOrange by mutableStateOf(akakceTintOrange)
        private set
    var akakceBaseGreen by mutableStateOf(akakceBaseGreen)
        private set
    var akakceTintGreen by mutableStateOf(akakceTintGreen)
        private set
    var akakceBaseRed by mutableStateOf(akakceBaseRed)
        private set
    var akakceTintRed by mutableStateOf(akakceTintRed)
        private set
    var akakceBasePurple by mutableStateOf(akakceBasePurple)
        private set
    var akakceTintPurple by mutableStateOf(akakceTintPurple)
        private set
    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        akakceBlueGray600: Color = this.akakceBlueGray600,
        akakceBlueGray500: Color = this.akakceBlueGray500,
        akakceBlueGray400: Color = this.akakceBlueGray400,
        akakceBlueGray300: Color = this.akakceBlueGray300,
        akakceBlueGray200: Color = this.akakceBlueGray200,
        akakceBlueGray100: Color = this.akakceBlueGray100,
        akakceBlueGray50: Color = this.akakceBlueGray50,
        akakceDarkBlue: Color = this.akakceDarkBlue,
        akakceRegularBlue: Color = this.akakceRegularBlue,
        akakceBaseBlue: Color = this.akakceBaseBlue,
        akakceTintBlue: Color = this.akakceTintBlue,
        akakceBaseOrange: Color = this.akakceBaseOrange,
        akakceTintOrange: Color = this.akakceTintOrange,
        akakceBaseGreen: Color = this.akakceBaseGreen,
        akakceTintGreen: Color = this.akakceTintGreen,
        akakceBaseRed: Color = this.akakceBaseRed,
        akakceTintRed: Color = this.akakceTintRed,
        akakceBasePurple: Color = this.akakceBasePurple,
        akakceTintPurple: Color = this.akakceTintPurple,
        isLight: Boolean = this.isLight
    ): AkakceColors = AkakceColors(
        akakceBlueGray600,
        akakceBlueGray500,
        akakceBlueGray400,
        akakceBlueGray300,
        akakceBlueGray200,
        akakceBlueGray100,
        akakceBlueGray50,
        akakceDarkBlue,
        akakceRegularBlue,
        akakceBaseBlue,
        akakceTintBlue,
        akakceBaseOrange,
        akakceTintOrange,
        akakceBaseGreen,
        akakceTintGreen,
        akakceBaseRed,
        akakceTintRed,
        akakceBasePurple,
        akakceTintPurple,
        isLight
    )

    fun updateColorsFrom(other: AkakceColors) {
        akakceBlueGray600 = other.akakceBlueGray600
        akakceBlueGray500 = other.akakceBlueGray500
        akakceBlueGray400 = other.akakceBlueGray400
        akakceBlueGray300 = other.akakceBlueGray300
        akakceBlueGray200 = other.akakceBlueGray200
        akakceBlueGray100 = other.akakceBlueGray100
        akakceBlueGray50 = other.akakceBlueGray50
        akakceDarkBlue = other.akakceDarkBlue
        akakceRegularBlue = other.akakceRegularBlue
        akakceBaseBlue = other.akakceBaseBlue
        akakceTintBlue = other.akakceTintBlue
        akakceBaseOrange = other.akakceBaseOrange
        akakceTintOrange = other.akakceTintOrange
        akakceBaseGreen = other.akakceBaseGreen
        akakceTintGreen = other.akakceTintGreen
        akakceBaseRed = other.akakceBaseRed
        akakceTintRed = other.akakceTintRed
        akakceBasePurple = other.akakceBasePurple
        akakceTintPurple = other.akakceTintPurple

    }
}

fun lightColors(
    akakceBlueGray600: Color = Color(0xFF2F3640),
    akakceBlueGray500: Color = Color(0xFF627285),
    akakceBlueGray400: Color = Color(0xFF9BA7B7),
    akakceBlueGray300: Color = Color(0xFFD3D9E1),
    akakceBlueGray200: Color = Color(0xFFEEF0F4),
    akakceBlueGray100: Color = Color(0xFFF7F8FA),
    akakceBlueGray50: Color = Color(0xFFFFFFFF),
    akakceDarkBlue: Color = Color(0xFF092E52),
    akakceRegularBlue: Color = Color(0xFF135BA5),
    akakceBaseBlue: Color = Color(0xFF2C89E7),
    akakceTintBlue: Color = Color(0xFFEAF3FD),
    akakceBaseOrange: Color = Color(0xFFE78A2C),
    akakceTintOrange: Color = Color(0xFFFCF2E2),
    akakceBaseGreen: Color = Color(0xFF3CA886),
    akakceTintGreen: Color = Color(0xFFE1F2ED),
    akakceBaseRed: Color = Color(0xFFF15249),
    akakceTintRed: Color = Color(0xFFFFEBED),
    akakceBasePurple: Color = Color(0xFF754BED),
    akakceTintPurple: Color = Color(0xFFF0EBFF)
): AkakceColors = AkakceColors(
    akakceBlueGray600 = akakceBlueGray600,
    akakceBlueGray500 = akakceBlueGray500,
    akakceBlueGray400 = akakceBlueGray400,
    akakceBlueGray300 = akakceBlueGray300,
    akakceBlueGray200 = akakceBlueGray200,
    akakceBlueGray100 = akakceBlueGray100,
    akakceBlueGray50 = akakceBlueGray50,
    akakceDarkBlue = akakceDarkBlue,
    akakceRegularBlue = akakceRegularBlue,
    akakceBaseBlue = akakceBaseBlue,
    akakceTintBlue = akakceTintBlue,
    akakceBaseOrange = akakceBaseOrange,
    akakceTintOrange = akakceTintOrange,
    akakceBaseGreen = akakceBaseGreen,
    akakceTintGreen = akakceTintGreen,
    akakceBaseRed = akakceBaseRed,
    akakceTintRed = akakceTintRed,
    akakceBasePurple = akakceBasePurple,
    akakceTintPurple = akakceTintPurple,
    isLight = true
)

fun darkColors(
    akakceBlueGray600: Color = Color(0xFFD8E1EA),
    akakceBlueGray500: Color = Color(0xFF95A2AE),
    akakceBlueGray400: Color = Color(0xFF6A747E),
    akakceBlueGray300: Color = Color(0xFF374049),
    akakceBlueGray200: Color = Color(0xFF1E2833),
    akakceBlueGray100: Color = Color(0xFF141E2A),
    akakceBlueGray50: Color = Color(0xFF05101C),
    akakceDarkBlue: Color = Color(0xFF6B8297),
    akakceRegularBlue: Color = Color(0xFF719DC9),
    akakceBaseBlue: Color = Color(0xFF93CBFA),
    akakceTintBlue: Color = Color(0xFF203449),
    akakceBaseOrange: Color = Color(0xFFF5C888),
    akakceTintOrange: Color = Color(0xFF363432),
    akakceBaseGreen: Color = Color(0xFF87CCB6),
    akakceTintGreen: Color = Color(0xFF22373D),
    akakceBaseRed: Color = Color(0xFFF19997),
    akakceTintRed: Color = Color(0xFF372D36),
    akakceBasePurple: Color = Color(0xFFAC93F4),
    akakceTintPurple: Color = Color(0xFF262A47)
): AkakceColors = AkakceColors(
    akakceBlueGray600 = akakceBlueGray600,
    akakceBlueGray500 = akakceBlueGray500,
    akakceBlueGray400 = akakceBlueGray400,
    akakceBlueGray300 = akakceBlueGray300,
    akakceBlueGray200 = akakceBlueGray200,
    akakceBlueGray100 = akakceBlueGray100,
    akakceBlueGray50 = akakceBlueGray50,
    akakceDarkBlue = akakceDarkBlue,
    akakceRegularBlue = akakceRegularBlue,
    akakceBaseBlue = akakceBaseBlue,
    akakceTintBlue = akakceTintBlue,
    akakceBaseOrange = akakceBaseOrange,
    akakceTintOrange = akakceTintOrange,
    akakceBaseGreen = akakceBaseGreen,
    akakceTintGreen = akakceTintGreen,
    akakceBaseRed = akakceBaseRed,
    akakceTintRed = akakceTintRed,
    akakceBasePurple = akakceBasePurple,
    akakceTintPurple = akakceTintPurple,
    isLight = false
)

val LocalColors = staticCompositionLocalOf { lightColors() }


