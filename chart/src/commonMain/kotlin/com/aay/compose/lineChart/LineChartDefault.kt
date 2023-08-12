package com.aay.compose.lineChart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aay.compose.lineChart.model.BackGroundGrid
import com.aay.compose.lineChart.model.LineParameters
import com.aay.compose.lineChart.model.LineType

object LineChartDefault {

    val lineParameters: List<LineParameters> = listOf(
        LineParameters(
            dataName = "revenue",
            data = emptyList(),
            lineColor = Color.Blue,
            lineType = LineType.QUADRATIC_LINE,
            lineShadow = true,
        )
    )
    val backGroundGrid = BackGroundGrid.SHOW
    val backGroundColor = Color.Gray
    const val ANIMATED_CHART = true
    val backgroundLineWidth = 1.dp
    val pathEffect = PathEffect.dashPathEffect(floatArrayOf(1f, 1f), 0f)
    val descriptionDefaultStyle = TextStyle(
        color = Color.Black,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400
    )

    val headerArrangement = Arrangement.spacedBy(24.dp)
    val axesStyle = TextStyle(
        fontSize = 12.sp,
        color = Color.Gray,
    )

}