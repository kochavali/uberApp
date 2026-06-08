package com.anurag.project.uber.uberApp.services;

import com.anurag.project.uber.uberApp.entities.Ride;
import com.anurag.project.uber.uberApp.entities.User;
import com.anurag.project.uber.uberApp.entities.Wallet;
import com.anurag.project.uber.uberApp.entities.enums.TransactionMethod;

public interface WalletService {
    Wallet addMoneyToWallet(User user, Double amount, String transactionId, Ride ride, TransactionMethod transactionMethod);

    Wallet addMoneyToWallet(User user , Double amount);

    Wallet deductMoneyFromWallet(User user , Double amount);

    void withDrawAllMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);
}
