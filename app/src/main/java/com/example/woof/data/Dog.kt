/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Alumni(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes  val id: Int,
    @StringRes val em: Int,
    @StringRes val add: Int,
    @StringRes val generation: Int,
    @StringRes val tel: Int

)

val alumnis = listOf(
    Alumni(R.drawable.photo1, R.string.alm_name_1, R.string.alm_id_1, R.string.alm_em_1,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_1),
    Alumni(R.drawable.photo2, R.string.alm_name_2, R.string.alm_id_2, R.string.alm_em_2,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_2),
    Alumni(R.drawable.photo3, R.string.alm_name_3, R.string.alm_id_3, R.string.alm_em_3,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_3),
    Alumni(R.drawable.photo4, R.string.alm_name_4, R.string.alm_id_4, R.string.alm_em_4,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_4),
    Alumni(R.drawable.photo5, R.string.alm_name_5, R.string.alm_id_5, R.string.alm_em_5,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_5),
    Alumni(R.drawable.photo6, R.string.alm_name_6, R.string.alm_id_6, R.string.alm_em_6,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_6),
    Alumni(R.drawable.photo7, R.string.alm_name_7, R.string.alm_id_7, R.string.alm_em_7,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_7),
    Alumni(R.drawable.photo8, R.string.alm_name_8, R.string.alm_id_8, R.string.alm_em_8,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_8),
    Alumni(R.drawable.photo9, R.string.alm_name_9, R.string.alm_id_9, R.string.alm_em_9,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_9),
    Alumni(R.drawable.photo10, R.string.alm_name_10, R.string.alm_id_10, R.string.alm_em_10,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_10),
    Alumni(R.drawable.photo11,R.string.alm_name_10,R.string.alm_id_11,R.string.alm_em_11,R.string.alm_add,R.string.alm_gen,R.string.alm_tel_11)
)
