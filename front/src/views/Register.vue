<!--注册页面-->
<template>
  <div class="register">
    <Header />
    <h1>Register</h1>
    <form @submit.prevent="registerUser">
      <div>
        <label for="username">Username:</label>
        <input type="text" v-model="username" required />
      </div>
      <div>
        <label for="email">Email:</label>
        <input type="email" v-model="email" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" v-model="password" required />
      </div>
      <button type="submit">Register</button>
    </form>
    <Footer />
  </div>
</template>

<script>
import Header from '@/components/Header.vue';
import Footer from '@/components/Footer.vue';
import { mapActions } from 'vuex';

export default {
  name: 'Register',
  components: {
    Header,
    Footer,
  },
  data() {
    return {
      username: '',
      email: '',
      password: '',
    };
  },
  methods: {
    ...mapActions('user', ['register']),
    registerUser() {
      const user = {
        username: this.username,
        email: this.email,
        password: this.password,
      };
      this.register(user).then(() => {
        // 注册成功后的处理，比如跳转到登录页
        this.$router.push('/login');
      }).catch(error => {
        // 处理注册失败的情况
        console.error("Registration failed:", error);
      });
    },
  },
};
</script>

<style scoped>
.register {
  text-align: center;
  padding: 20px;
}

.register form {
  max-width: 600px;
  margin: 0 auto;
  text-align: left;
}

.register label {
  display: block;
  margin-bottom: 5px;
}

.register input {
  width: 100%;
  padding: 8px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.register button {
  background-color: #42b983;
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  cursor: pointer;
  border-radius: 4px;
}

.register button:hover {
  background-color: #333;
}
</style>
