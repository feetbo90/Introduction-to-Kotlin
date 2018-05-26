/*
 * Copyright 2017 Miguel Castiblanco
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package linear.app.bel.cobacoroutine

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

/**
 * Sample of a okHttp client that uses coroutines
 * Created by macastiblancot on 2/13/17.
 */
object SampleClient {
    val client = OkHttpClient()

    fun fetchPosts() : Deferred<String> {
        return async(CommonPool) {
            //delay(500)
            val request2 = FormBody.Builder().add("test", "testing").build()
            val request = Request.Builder().url("https://raw.github.com/square/okhttp/master/README.md").build()
            client.newCall(request).execute().body().string()


        }
    }
}

data class Post(
        val id: Int,
        val userId: Int,
        val title: String,
        val body: String)