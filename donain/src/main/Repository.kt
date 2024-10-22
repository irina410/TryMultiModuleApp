interface Repository {
    suspend fun loadQ() : Pair<Boolean, String>
}