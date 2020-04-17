/*
 * Copyright (c) 2020 Noonmaru
 *  
 *  Licensed under the General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.noonmaru.regions.api

import com.github.noonmaru.tap.mojang.MojangProfile
import org.bukkit.World
import org.bukkit.entity.Player
import java.util.*


interface RegionManager {
    val cachedUsers: List<User>

    val onlineUsers: List<User>

    val worlds: List<RegionWorld>

    val regions: List<Region>

    fun findUser(uniqueId: UUID): User?

    fun getUser(profile: MojangProfile): User

    fun getUser(player: Player): User?

    fun getRegionWorld(bukkitWorld: World): RegionWorld?

    fun getRegionWorld(name: String): RegionWorld?

    fun getRegion(name: String): Region?

    fun registerNewRegion(name: String, world: RegionWorld, box: RegionBox): Region

    fun removeRegion(name: String): Region?

    fun regionAt(bukkitWorld: World, x: Int, y: Int, z: Int): Region?

    fun areaAt(bukkitWorld: World, x: Int, y: Int, z: Int): Area?

    fun saveAll()

}