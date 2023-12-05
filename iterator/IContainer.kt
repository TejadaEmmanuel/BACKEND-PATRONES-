package iterator.impl

import iterator.IIterator

interface IContainer<T> {
    fun createIterator(): IIterator<T>
}