package com.camihruiz24.busschedulebycamihruiz24.ui

import androidx.lifecycle.ViewModel
import com.camihruiz24.busschedulebycamihruiz24.data.BusSchedule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject


@HiltViewModel
class BusScheduleViewModel @Inject internal constructor(): ViewModel() {

    // Get example bus schedule
    fun getFullSchedule(): Flow<List<BusSchedule>> = flowOf(
        listOf(
            BusSchedule(
                1,
                "Example Street",
                0
            )
        )
    )

    // Get example bus schedule by stop
    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> = flowOf(
        listOf(
            BusSchedule(
                1,
                "Example Street",
                0
            )
        )
    )

}