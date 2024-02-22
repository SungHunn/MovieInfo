package com.example.movieinfo.library.storage.di

import com.example.movieinfo.library.storage.IStorage
import com.example.movieinfo.library.storage.StorageManager
import com.example.movieinfo.library.storage.helpers.DataConverter
import com.example.movieinfo.library.storage.helpers.DataEncoding
import com.example.movieinfo.library.storage.prefs.SharedPrefsStorageProvider
import com.example.movieinfo.library.storage.prefs.StorageProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Singleton
    @Provides
    fun bindOnDiscStorage(
        storage: StorageProvider,
        converter: DataConverter,
        encoding: DataEncoding
    ): IStorage = StorageManager(storage, converter, encoding)

    @Provides
    fun provideSharePrefStorageProvider(provider: SharedPrefsStorageProvider): StorageProvider =
        provider

}