package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunSortedByDate() = runDAO.getAllRunSortedByDate()
    fun getAllRunSortedByDistance() = runDAO.getAllRunSortedByDistanceInMeters()
    fun getAllRunSortedByTimeInMillis() = runDAO.getAllRunSortedByTimeInMillis()
    fun getAllRunSortedByAvgSpeed() = runDAO.getAllRunSortedByAvgSpeed()
    fun getAllRunSortedByCaloriesBurned() = runDAO.getAllRunSortedByCaloriesBurned()
    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalDistance() = runDAO.getTotalDistanceInMeters()
    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()
}