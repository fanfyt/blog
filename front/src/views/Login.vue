<!--登录页面-->
<template>
  <div class="login">
    <Header/>
    <h1>Login</h1>
    <form @submit.prevent="login">
      <div>
        <label for="username">Username:</label>
        <input type="text" v-model="username" required/>
      </div>
      <div>
        <label for="email">Email:</label>
        <input type="email" v-model="email"/>
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" v-model="password" required/>
      </div>
      <button type="submit">Login</button>
    </form>
    <div v-if="errorMessage" class="error-message">{{ errorMessage }}</div>
    <Footer/>
  </div>
</template>

<script>
import Header from '@/components/Header.vue';
import Footer from '@/components/Footer.vue';
import {mapActions} from 'vuex';

export default {
  name: 'Login',
  components: {
    Header,
    Footer,
  },
  data() {
    return {
      username: '',
      email: '',
      password: '',
      errorMessage: '',
    };
  },
  methods: {
    ...mapActions( ['login']),
  },
  async login() {
    try {
      await this.login({username: this.username, password: this.password});
      this.$router.push('/login');
    } catch (error) {
      this.errorMessage = 'Login failed. Please check your username and password.';
    }
  },
};
</script>

<style scoped>
.login {
  text-align: center;
  padding: 20px;
}
</style>
