/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11.reactiveparadigm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 *
 * @author jufeq
 */
public class CustomObservable<T> extends Observable<T> {

    private T data;  // Dato que emitirá este Observable personalizado

    public CustomObservable(T data) {
        this.data = data;
    }

    public CustomObservable() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    protected void subscribeActual(Observer<? super T> observer) {
        // Notificamos al Observer que se ha realizado la suscripción
        observer.onSubscribe(new Disposable() {
            private boolean isDisposed = false;

            @Override
            public void dispose() {
                isDisposed = true;
            }

            @Override
            public boolean isDisposed() {
                return isDisposed;
            }
        });

        // Emitimos el dato y completamos
        try {
            observer.onNext(data);  // Emitimos el dato
            observer.onComplete();  // Terminamos la emisión
        } catch (Exception e) {
            observer.onError(e);  // Si ocurre un error, lo notificamos
        }
    }
}
