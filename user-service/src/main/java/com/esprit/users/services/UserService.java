package com.esprit.users.services;

import com.esprit.users.entity.User;
import com.esprit.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class UserService {
        @Autowired
        private UserRepository userRepository;

        // Create operation
        public User createUser(User product) {
            return userRepository.save(product);
        }

        // Read operations
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        public Optional<User> getUserById(Long id) {
            return userRepository.findById(id);
        }

        // Update operation
        public User updateUser(Long id, User product) {
            if (userRepository.existsById(id)) {
                product.setId(id); // assurez-vous que l'ID de l'objet à sauvegarder correspond à celui passé en paramètre
                return userRepository.save(product);
            } else {
                return null; // ou vous pouvez lever une exception selon vos besoins
            }
        }

        // Delete operation
        public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
    }

